public class DoneOrder implements Order_interface {
    @Override
    public boolean order(Order order) {
        return order.order();
    }
}
