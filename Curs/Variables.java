package Curs;

public class Variables {
    public static void main(String[] args) {

        // strongly typed - trebuie specificat tipul de date

        // variabila = zona din memorie care tine date
        String marcaMasina = "Volvo";
        String modelMasina = "XC60";
        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este model: " + modelMasina);

        // suprascriere
        modelMasina = "XC60 Facelift";
        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este model: " + modelMasina);

        // declarare
        String prenume, nume;
        int varsta;

        //initializare
        prenume = "Ianis";
        nume = "Hagi";
        varsta = 25;

        //  concatenare de string-uri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta + " ani");

    }
}
