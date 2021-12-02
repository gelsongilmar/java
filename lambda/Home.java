import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class Home {
    
    public static void main(String ... args) {

        Usuario user1 = new Usuario("Fulado da Silva", 150);
        Usuario user2 = new Usuario("Cicla de Souza", 120);
        Usuario user3 = new Usuario("Deutrano Marques", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        System.out.println("===>>> Modelo 01");
        for(Usuario u: usuarios) {
            System.out.println(u.getNome());
        }

        System.out.println("===>>> Modelo 02");
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);

        System.out.println("===>>> Modelo 03");
        Consumer<Usuario> mostradorAnonimo = new Consumer<Usuario>() {
            public void accept(Usuario u){
                System.out.println(u.getNome());
            }
        };
        usuarios.forEach(mostradorAnonimo);

        System.out.println("===>>> Modelo 04");
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });

        System.out.println("===>>> Modelo Lambda 01");
        Consumer<Usuario> mostradorLambda01 = (Usuario u) -> {System.out.println(u.getNome());};
        usuarios.forEach(mostradorLambda01);

        System.out.println("===>>> Modelo Lambda 02");
        Consumer<Usuario> mostradorLambda02 = u -> {System.out.println(u.getNome());};
        usuarios.forEach(mostradorLambda02);

        System.out.println("===>>> Modelo Lambda 03");
        Consumer<Usuario> mostradorLambda03 = u -> System.out.println(u.getNome());
        usuarios.forEach(mostradorLambda03);

        System.out.println("===>>> Modelo Lambda Consolidado");
        usuarios.forEach(u -> System.out.println(u.getNome()));
        usuarios.forEach(u -> u.tornaModerador());
    }
}
