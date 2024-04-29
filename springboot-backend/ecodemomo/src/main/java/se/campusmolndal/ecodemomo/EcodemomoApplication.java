package se.campusmolndal.ecodemomo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import se.campusmolndal.ecodemomo.model.Product;
import se.campusmolndal.ecodemomo.repository.ProductRepository;
import se.campusmolndal.ecodemomo.service.ProductService;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EcodemomoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcodemomoApplication.class, args);
    }

    @Bean
    public CommandLineRunner initProducts(ProductRepository productRepository) {
        return (args) -> {
            List<Product> products = Arrays.asList(
                    new Product(1L,"Eko Honung", "På våra gårdar i det vackra svenska landskapet producerar vi med stolthet en av naturens mest älskade delikatesser - svensk honung. Genom vår passion för biodling och respekt för naturens processer strävar vi efter att erbjuda honung av högsta kvalitet, direkt från bikupan till ditt kök. Våra bin utforskar de blomstrande ängarna och skogarna runt gården, samlar nektar från svenska växter och blommor, från rapsfälten till lavendelbuskar och ängsblommor. Med noggrannhet och omsorg skördar vi vårt biologiska guld, bevarar dess naturliga smak och näringsämnen, utan tillsatser. Varje sked är fylld med svensk sommars härliga smak och kärlek från våra bikupor", 100.0, 100, "natural-honey", "http://localhost:8089/uploads/Image"),
                    new Product(2L, "Eko Ägg", "På våra gårdar lever glada hönor i harmoni, vars välbefinnande är högsta prioritet. Vi tar hand om dem med omsorg och uppmärksamhet, vilket resulterar i ägg av högsta kvalitet fyllda med smak och näringsämnen. Med fritt rörliga hönor, tillgång till näringsrik mat och friskt vatten, strävar vi efter att fortsätta vår tradition av omsorg och kvalitet på våra gårdar, välkomnar alla att smaka på skillnaden.", 200.0, 100, "organic-eggs", "http://localhost:8089/uploads/Image1"),
                    new Product(3L, "Eko Mjölk", "Vår ekologiska mjölk är en del av vår passion för att skapa en hållbar och hälsosam framtid. På våra gårdar i det svenska landskapet tar vi hand om våra kor med omsorg och respekt, vilket resulterar i mjölk av högsta kvalitet. Med tillgång till näringsrik mat och friskt vatten, strävar vi efter att fortsätta vår tradition av omsorg och kvalitet på våra gårdar, välkomnar alla att smaka på skillnaden.", 300.0, 100, "organic-milk", "http://localhost:8089/uploads/Image2"),
                    new Product(4L, "Rött Vin", "På våra soliga vingårdar i det svenska landskapet skapas vita viner av exceptionell kvalitet och karaktär. Genom unika mikroklimat och expertis i lokala druvsorter framställs förbluffande viner med svensk prägel. Från skörd till buteljering övervakas varje steg med noggrannhet för att bevara druvornas naturliga smaker och aromer. Vårt svenska vita vin hyllar landskapet, klimatet och vår passion för vinodling, och varje glas är en smakresa genom det svenska landskapet.", 400.0, 100, "fine-red-wine", "http://localhost:8089/uploads/Image3"),
                    new Product(5L, "Eko Frukt & Grönsaker", "På våra gårdar odlar vi mångfaldiga grönsaker och frukter med omsorg och ekologiska principer. Varje gröda handplockas vid optimal mognad för att säkerställa smakrik och näringsrik kvalitet. Från solbelysta grönsaksland till fruktträdens dignande grenar erbjuder vi en färgsprakande mångfald av saftiga och aromatiska produkter. Varje tugga bär på kärleken och omsorgen som våra grödor har fått, och vi är stolta över att dela denna kvalitet med våra kunder.", 500.0, 100, "organic-fruit", "http://localhost:8089/uploads/Image4"),
                    new Product(6L, "Premium Eko Kött", "På våra gårdar prioriterar vi våra djurs välbefinnande, vilket ger kött av exceptionell kvalitet. Genom att låta dem leva fritt och tillhandahålla näringsrik föda och rent vatten skapar vi en miljö där djuren trivs naturligt. Vårt noggrant utvalda djurbestånd uppfostras med omsorg och respekt för deras naturliga behov, vilket resulterar i kött av överlägsen kvalitet. Varje tugga av vårt kött återspeglar den omsorg och uppmärksamhet som lagts ned på deras uppfödning, och vi är stolta över att erbjuda våra kunder produkter från välmående djur.", 600.0, 100, "premium-meat-cuts", "http://localhost:8089/uploads/Image5")
                // Add more products...
            );

            productRepository.saveAll(products);
        };
    }
}

