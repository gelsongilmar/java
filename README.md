# Projetos de Teste Java
Repositório com projetos de teste java

## Lamba
A pasta lambda possui exemplos de uso de lambdas com java. Uma demostração de como realizar loops em uma lista sem o uso de lambda e como isso fica facilitado com o uso das mesmas.

### Sem lambda
'''

        for(Usuario u: usuarios) {
            System.out.println(u.getNome());
        }

'''

### Com lambda
'''
        usuarios.forEach(u -> System.out.println(u.getNome()));
'''
