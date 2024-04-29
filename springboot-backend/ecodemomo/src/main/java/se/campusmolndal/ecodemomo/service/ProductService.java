package se.campusmolndal.ecodemomo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.campusmolndal.ecodemomo.model.Product;
import java.util.List;
import se.campusmolndal.ecodemomo.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product saveProduct(Product product) {

        return productRepository.save(product);
    }

    public void saveAllProducts(List<Product> products) {
        productRepository.saveAll(products);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void addProducts() {
     Product product1 = new Product();
     product1.setId(1L);
        product1.setName("Eko Honung");
        product1.setDescription("På våra gårdar i det vackra svenska landskapet producerar vi med stolthet en av naturens mest älskade delikatesser - svensk honung. Genom vår passion för biodling och respekt för naturens processer strävar vi efter att erbjuda honung av högsta kvalitet, direkt från bikupan till ditt kök. Våra bin utforskar de blomstrande ängarna och skogarna runt gården, samlar nektar från svenska växter och blommor, från rapsfälten till lavendelbuskar och ängsblommor. Med noggrannhet och omsorg skördar vi vårt biologiska guld, bevarar dess naturliga smak och näringsämnen, utan tillsatser. Varje sked är fylld med svensk sommars härliga smak och kärlek från våra bikupor.");
        product1.setPrice(100.0);
        product1.setQuantity(100);
        product1.setSlug("natural-honey");
        product1.setImage("react-frontend/react-ecoeats/src/honey.jpg");
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Eko Ägg");
        product2.setDescription("På våra gårdar lever glada hönor i harmoni, vars välbefinnande är högsta prioritet. Vi tar hand om dem med omsorg och uppmärksamhet, vilket resulterar i ägg av högsta kvalitet fyllda med smak och näringsämnen. Med fritt rörliga hönor, tillgång till näringsrik mat och friskt vatten, strävar vi efter att fortsätta vår tradition av omsorg och kvalitet på våra gårdar, välkomnar alla att smaka på skillnaden.");
        product2.setPrice(200.0);
        product2.setQuantity(100);
        product2.setSlug("organic-eggs");
        product2.setImage("react-frontend/react-ecoeats/src/eggs.jpg");
        productRepository.save(product2);

        Product product3 = new Product();
        product3.setId(3L);
        product3.setName("Eko Mjölk");
        product3.setDescription("På våra gårdar lever våra kor i harmoni med naturen, fritt att utforska gröna ängar och dricka friskt vatten. Deras välmående främjas både fysiskt och mentalt genom friheten att ströva och beta. Vi tror att vår omtanke och respekt för kor skapar en miljö där de trivs och producerar mjölk av högsta kvalitet. Varje droppe bär med sig den kärlek och omsorg vi investerar i våra djur, och vi är stolta över att erbjuda kunder mjölk med en smak som endast kommer från glada kor.");
        product3.setPrice(300.0);
        product3.setQuantity(100);
        product3.setSlug("organic-milk");
        product3.setImage("react-frontend/react-ecoeats/src/milk.jpg");
        productRepository.save(product3);

        Product product4 = new Product();
        product4.setId(4L);
        product4.setName("Rött Vin");
        product4.setDescription("På våra soliga vingårdar i det svenska landskapet skapas vita viner av exceptionell kvalitet och karaktär. Genom unika mikroklimat och expertis i lokala druvsorter framställs förbluffande viner med svensk prägel. Från skörd till buteljering övervakas varje steg med noggrannhet för att bevara druvornas naturliga smaker och aromer. Vårt svenska vita vin hyllar landskapet, klimatet och vår passion för vinodling, och varje glas är en smakresa genom det svenska landskapet.");
        product4.setPrice(400.0);
        product4.setQuantity(100);
        product4.setSlug("fine-red-wine");
        product4.setImage("react-frontend/react-ecoeats/src/wine.jpg");
        productRepository.save(product4);

        Product product5 = new Product();
        product5.setId(5L);
        product5.setName("Eko Frukt & Grönsaker");
        product5.setDescription("På våra gårdar odlar vi mångfaldiga grönsaker och frukter med omsorg och ekologiska principer. Varje gröda handplockas vid optimal mognad för att säkerställa smakrik och näringsrik kvalitet. Från solbelysta grönsaksland till fruktträdens dignande grenar erbjuder vi en färgsprakande mångfald av saftiga och aromatiska produkter. Varje tugga bär på kärleken och omsorgen som våra grödor har fått, och vi är stolta över att dela denna kvalitet med våra kunder.");
        product5.setPrice(500.0);
        product5.setQuantity(100);
        product5.setSlug("organic-fruit");
        product5.setImage("react-frontend/react-ecoeats/src/fruit.jpg");
        productRepository.save(product5);

        Product product6 = new Product();
        product6.setId(6L);
        product6.setName("Premium Eko Kött");
        product6.setDescription("På våra gårdar prioriterar vi våra djurs välbefinnande, vilket ger kött av exceptionell kvalitet. Genom att låta dem leva fritt och tillhandahålla näringsrik föda och rent vatten skapar vi en miljö där djuren trivs naturligt. Vårt noggrant utvalda djurbestånd uppfostras med omsorg och respekt för deras naturliga behov, vilket resulterar i kött av överlägsen kvalitet. Varje tugga av vårt kött återspeglar den omsorg och uppmärksamhet som lagts ned på deras uppfödning, och vi är stolta över att erbjuda våra kunder produkter från välmående djur.");
        product6.setPrice(600.0);
        product6.setQuantity(100);
        product6.setSlug("premium-meat-cuts");
        product6.setImage("react-frontend/react-ecoeats/src/meat.jpg");
        productRepository.save(product6);

        // add products
    }
    // other methods
}