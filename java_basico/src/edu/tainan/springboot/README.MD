## Autores
- Tainan Rocha

## Spring com Java
O Spring é um framework para desenvolvimento de aplicações em Java. Ele oferece uma vasta gama de funcionalidades que facilitam a criação de aplicações robustas, escaláveis e de fácil manutenção. 

https://start.spring.io/

- `Definição:` O Spring facilita o gerenciamento de dependências entre os componentes da aplicação. Em vez de os componentes criarem suas dependências diretamente, o Spring injeta essas dependências, promovendo um código mais modular e fácil de testar.

- `Benefício:`: Reduz o acoplamento entre os componentes e melhora a testabilidade e a manutenção do código.

## Estruturas e conceitos vistas no curso de SpringBoot

- `CommandLineRunner`: Executa código específico quando a aplicação Spring Boot é iniciada.
- `@Autowired`: Injeta automaticamente dependências gerenciadas pelo Spring.

- `@Bean`: Use quando você deseja definir manualmente beans dentro de classes de configuração (`@Configuration`). Útil quando você não tem acesso ao código-fonte ou precisa de uma configuração personalizada.

- `@Component`: Use para autodetecção de beans. Útil quando você tem controle sobre o código-fonte e deseja que o Spring registre automaticamente os beans.

- `Singleton Scope`: Um bean definido com o escopo Singleton tem apenas uma única instância por contexto Spring. Esta instância é criada quando o container é iniciado e é reutilizada em todas as injeções subsequentes.

- `Prototype Scope`: Um bean definido com o escopo Prototype cria uma nova instância cada vez que é solicitado do container Spring.

- `properties`: Em Spring, as propriedades (`properties`) são usadas para configurar valores que podem ser injetados nos beans de forma externa, o que facilita a configuração e manutenção do aplicativo. Isso permite que você separe os valores de configuração do código-fonte, tornando-o mais limpo e fácil de gerenciar.

- `@ConfigurationProperties`: E usada para mapear propriedades externas, como aquelas definidas em arquivos application.properties ou application.yml, para objetos Java. Isso permite agrupar várias propriedades relacionadas em um único bean, tornando a configuração mais estruturada e gerenciável.
