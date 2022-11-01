public interface IQuantity {

    static int ReduceQuantity(Produs prd,int cantitate){

       int i= prd.getCantitate();
       i-=cantitate;

        return i;
    }
}
