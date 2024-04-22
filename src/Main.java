public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria clinica = new Veterinaria();
        // Crear dos clientes
        Cliente c1 = new Cliente("Paco", "Algúnlado Nº 12", "000000000");
        Cliente c2 = new Cliente("Rebeca", "Calledearriba Nº 17", "111111111");
        // Agregar clientes a la veterinaria
        clinica.agregarCliente(c1);
        clinica.agregarCliente(c2);
        // Crear dos animales
        Animal a1 = new Animal("Gato", "Perro", "Naranja", c1);
        Animal a2 = new Animal("Perro", "Gato", "Labrador", c2);

        // Agregar animales a la veterinaria
        clinica.agregarAnimal(a1);
        clinica.agregarAnimal(a2);
        //Crear un veterinario
        Veterinario vet1 = new Veterinario();
        // Crear una consulta
        Consulta con1 = new Consulta("12/5/2021", "Mocos", "Catarro común", "Pastillas y para casa", vet1);

        // Asignar la consulta a un animal
        a2.agregarConsulta(con1);
        //Imprimir todas las consultas de los animales de la clínica
        clinica.imprimirConsultas();
    }

}