import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class CSVTester {

    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/cars.csv";
      try (
              Reader reader = Files.newBufferedReader(Paths.get(fileName));
        ){
            ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
            strategy.setType(Car.class);
            String[] memberFieldsToBindTo = {"id", "name", "price"};
            strategy.setColumnMapping(memberFieldsToBindTo);

            CsvToBean<Car> csvToBean = new CsvToBeanBuilder(reader)
                    .withMappingStrategy(strategy)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();


            Iterator<Car> carIterator= csvToBean.iterator();
            while (carIterator.hasNext()){
                Car Car= carIterator.next();
                System.out.println("Id: "+ Car.getId());
                System.out.println("Name: "+ Car.getName());
                System.out.println("Price "+Car. getPrice());
                System.out.println("-------------");
            }


        }
    }
}
