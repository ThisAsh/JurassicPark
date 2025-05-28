

public interface DAO<A>{
    //metodi astratti che verranno implementati da un altra classe

    A trova(String nome); //read

    void nutri(); //update

    void cura(); //update

    void vendi(A animaleDaVendere); //delete

}