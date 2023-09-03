package ProductManager;
public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("товара с таким id " + id + " нет");
    }
}
