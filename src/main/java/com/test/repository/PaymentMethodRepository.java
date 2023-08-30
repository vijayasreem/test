@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

    Optional<PaymentMethod> findById(Long id);
    
    List<PaymentMethod> findAllByType(String type);
    
    List<PaymentMethod> findAllByNotification(String notification);
    
    void processCreditCard(String creditCardNumber);
    
    void acceptCash();
    
}