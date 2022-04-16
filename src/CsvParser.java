
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CsvParser {
    private final String[] month = new String[]{"01", "02", "03"};
    private static HashMap<Integer, ArrayList<MonthlyReport>> mapMonthReport = new HashMap();
    private static List<YearlyReport> yearlyReports = new ArrayList();
    private  BufferedReader br;
private  boolean readYearFile=false;
private  boolean readMonthFile=false;
    public static List<YearlyReport> getList() {
        return yearlyReports;
    }
    public void readFileYear() throws IOException {
        if(readYearFile){
            System.out.println("Годовой отчет уже считан");
            return;
        }
        String url = "./resources/y.2021.csv";
        File file = new File(url);
        try {
             br = new BufferedReader(new FileReader(file));
            String s = br.readLine();
            while((s = br.readLine()) != null) {
                String[] array = s.split(",");
                yearlyReports.add(new YearlyReport(Integer.parseInt(array[0]), Boolean.parseBoolean(array[2]), Integer.parseInt(array[1])));
            }
        } catch (IOException var6) {
            System.out.println("Не удалось считать годовой отчет");
        }
        finally {
            br.close();
        }
        readYearFile=true;
    }

    public void readMonthFile() throws IOException {
        if(readMonthFile){
            System.out.println("Месячный отчет уже считан ");
            return;
        }
        for(int i = 0; i < month.length; ++i) {
            String actualMonth = month[i];
            String url = "./resources/m.2021" + actualMonth + ".csv";
            File file = new File(url);
            try {
                br = new BufferedReader(new FileReader(file));
                String s = br.readLine();
                ArrayList<MonthlyReport> monthList = new ArrayList<>();

                while((s = br.readLine()) != null) {
                    String[] array = s.split(",");
                    monthList.add(new MonthlyReport(array[0], Boolean.parseBoolean(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3])));
                }
                mapMonthReport.put(Integer.parseInt(month[i]), monthList);
            } catch (IOException var8) {
                System.out.println("Не удалось считать месячный отчет");
            }
            finally {
                br.close();
            }
        }
readMonthFile=true;
    }

    public static HashMap<Integer, ArrayList<MonthlyReport>> getMap() {
        return mapMonthReport;
    }
}
