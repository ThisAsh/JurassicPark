public interface DAO{
    //metodi astratti che verranno implementati da un altra classe

    Dinosauro trova(String nome); //read

    void nutri(); //update

    void cura(); //update

    void vendi(Dinosauro dinoDaVendere); //delete

    void printInfo();

}