

public interface DAO<A>{
    //metodi astratti che verranno implementati da un altra classe

    A trova(String nome); //read

    void nutri(A animaleDaNutrire); //update

    void cura(A animaleDaCurare); //update

    void vendi(A animaleDaVendere); //delete

}