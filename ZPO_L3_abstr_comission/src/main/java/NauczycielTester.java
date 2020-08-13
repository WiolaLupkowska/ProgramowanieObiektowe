import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class NauczycielTester {

    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/Lancaster_County_School_Salaries.csv";
        try (
                Reader reader = Files.newBufferedReader(Paths.get(fileName));
        ){
            ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
            strategy.setType(Nauczyciel.class);
            String[] memberFieldsToBindTo = {"Name","Surname","Salary","District","Position"};
            strategy.setColumnMapping(memberFieldsToBindTo);

            CsvToBean<Nauczyciel> csvToBean = new CsvToBeanBuilder(reader)
                    .withMappingStrategy(strategy)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();


            Iterator<Nauczyciel> NauczycielIterator= csvToBean.iterator();
            while (NauczycielIterator.hasNext()){
                Nauczyciel Nauczyciel= NauczycielIterator.next();
                System.out.println("Id: "+ Nauczyciel.getSalary());
                System.out.println("Name: "+ Nauczyciel.getDistrict());
                System.out.println("Price "+ Nauczyciel. getPosition());
                System.out.println("-------------");
            }


        }
    }














}
