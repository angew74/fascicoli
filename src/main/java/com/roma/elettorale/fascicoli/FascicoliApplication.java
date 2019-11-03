package com.roma.elettorale.fascicoli;

import com.roma.elettorale.fascicoli.service.ElaborazionePenali;
import com.roma.elettorale.fascicoli.service.ElaborazioneRichieste;
import com.roma.elettorale.fascicoli.service.ManageFiles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableTransactionManagement
public class FascicoliApplication {

    Logger logger = LoggerFactory.getLogger(FascicoliApplication.class);

    @Autowired
    Environment env;

    @Autowired
    ManageFiles manageFiles;
    @Autowired
    ElaborazioneRichieste elaborazioneRichieste;

    @Autowired
    ElaborazionePenali elaborazionePenali;


    public static void main(String[] args) {
        SpringApplication.run(FascicoliApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {
            String folderin = env.getProperty("folderin");
            String folderout = env.getProperty("folderout");
            List<File> filesInFolder = Files.walk(Paths.get(folderin))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());
            for (File f : filesInFolder) {
                Boolean ok = manageFiles.leggifile(f);             //
                if (ok) {
                    f.renameTo
                            (new File(folderout + f.getName()));
                    f.delete();
                }
            }
            elaborazioneRichieste.createCertificato();
          // elaborazionePenali.caricaRichieste(env.getProperty(("rootpenali")));
          //  elaborazionePenali.caricaFile();
        };
    }

}
