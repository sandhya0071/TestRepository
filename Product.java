@DataJpaTest
public class ProductRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private ProductRepository repository;
     
    @Test
    @Rollback(false)
    public void testSaveNewProduct() {
        ...
    }
     
    @Test  
    public void testUpdateProduct() {
        ...
    }
}