package manager;

import models.Contact;
import models.User;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProviderData {

    @DataProvider
    public Iterator<Object[]> userDTO() { // Data Transfer Object = DTO
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{
                User.builder()
                        .email("kira20@gmail.com")
                        .password("2008Kira!")
                        .build()
        });
        list.add(new Object[]{
                User.builder()
                        .email("lama@gmail.com")
                        .password("Mm52673!")
                        .build()
        });
        list.add(new Object[]{
                User.builder()
                        .email("cat99@gmail.com")
                        .password("Ct00074#")
                        .build()
        });
        return list.iterator();
    }
    @DataProvider
    public Iterator<Object[]> contactDTO() { // Data Transfer Object = DTO
        List<Object[]> list = new ArrayList<>();
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        list.add(new Object[]{
                Contact.builder()
                        .name("Anna")
                        .lastName("Popova")
                        .phone("125896228"+i)
                        .address("Netanya")
                        .email("Anna" +i +"@gmail.com")
                        .description("sister")
                        .build()
        });
        list.add(new Object[]{
                Contact.builder()
                        .name("Anna")
                        .lastName("Popova")
                        .phone("125896228"+i)
                        .address("Netanya")
                        .email("Anna" +i +"@gmail.com")
                        .description("sister")
                        .build()
        });
        return  list.iterator();
    }
    @DataProvider
    public Iterator<Object[]> registrationCSV() throws IOException { // Data Transfer Object = DTO
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/reg_dataset.csv")));
        String line = reader.readLine();
        while (line !=null){
            String [] split = line.split(",");
            list.add(new Object[]{
                    User.builder()
                            .email(split[0])
                            .password(split[1])
                            .build()
            });
            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }

}
