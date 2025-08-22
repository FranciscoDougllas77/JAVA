# 📜 Comandos Java: Do Básico ao Avançado

Este documento lista **200 comandos, palavras-chave, métodos e conceitos do Java**, organizados por categoria e ordenados do básico ao avançado. Cada item inclui uma breve descrição e, quando aplicável, um exemplo. As categorias são:

1. **🔍 Básicos (Sintaxe, Variáveis, Operadores, Controle de Fluxo)**
2. **🛠️ Intermediários (Classes, Objetos, Coleções, Exceções)**
3. **🚀 Avançados (Streams, Concorrência, Generics, I/O, Lambda)**

---

## 1. 🔍 Comandos Básicos

Comandos fundamentais para sintaxe, manipulação de variáveis e controle de fluxo.

### Palavras-chave e Sintaxe
1. **`public`** - Define acesso público.  
   - Exemplo: `public class MyClass {}`
2. **`private`** - Define acesso privado.  
   - Exemplo: `private int x;`
3. **`protected`** - Define acesso protegido.  
   - Exemplo: `protected void method() {}`
4. **`static`** - Define membro de classe.  
   - Exemplo: `static int count;`
5. **`final`** - Impede modificação (constante ou herança).  
   - Exemplo: `final int MAX = 100;`
6. **`void`** - Indica que método não retorna valor.  
   - Exemplo: `void print() {}`
7. **`class`** - Define uma classe.  
   - Exemplo: `class MyClass {}`
8. **`interface`** - Define uma interface.  
   - Exemplo: `interface MyInterface {}`
9. **`extends`** - Herda uma classe.  
   - Exemplo: `class Child extends Parent {}`
10. **`implements`** - Implementa uma interface.  
    - Exemplo: `class MyClass implements MyInterface {}`
11. **`new`** - Cria instância de objeto.  
    - Exemplo: `MyClass obj = new MyClass();`
12. **`this`** - Refere-se à instância atual.  
    - Exemplo: `this.x = x;`
13. **`super`** - Refere-se à superclasse.  
    - Exemplo: `super.method();`
14. **`import`** - Importa pacotes ou classes.  
    - Exemplo: `import java.util.ArrayList;`
15. **`package`** - Define pacote.  
    - Exemplo: `package com.example;`

### Tipos de Dados
16. **`int`** - Tipo inteiro de 32 bits.  
    - Exemplo: `int x = 10;`
17. **`double`** - Tipo de ponto flutuante de 64 bits.  
    - Exemplo: `double y = 3.14;`
18. **`float`** - Tipo de ponto flutuante de 32 bits.  
    - Exemplo: `float z = 2.5f;`
19. **`boolean`** - Tipo booleano (true/false).  
    - Exemplo: `boolean flag = true;`
20. **`char`** - Tipo caractere Unicode.  
    - Exemplo: `char c = 'A';`
21. **`byte`** - Tipo inteiro de 8 bits.  
    - Exemplo: `byte b = 127;`
22. **`short`** - Tipo inteiro de 16 bits.  
    - Exemplo: `short s = 32767;`
23. **`long`** - Tipo inteiro de 64 bits.  
    - Exemplo: `long l = 1000000L;`
24. **`String`** - Classe para strings imutáveis.  
    - Exemplo: `String str = "Hello";`

### Operadores
25. **`=`** - Atribuição.  
    - Exemplo: `x = 5;`
26. **`==`** - Comparação de igualdade.  
    - Exemplo: `if (x == 5) {}`
27. **`!=`** - Comparação de desigualdade.  
    - Exemplo: `if (x != 5) {}`
28. **`>`** - Maior que.  
    - Exemplo: `if (x > 5) {}`
29. **`<`** - Menor que.  
    - Exemplo: `if (x < 5) {}`
30. **`>=`** - Maior ou igual.  
    - Exemplo: `if (x >= 5) {}`
31. **`<=`** - Menor ou igual.  
    - Exemplo: `if (x <= 5) {}`
32. **`+`** - Adição ou concatenação.  
    - Exemplo: `int z = x + y;`
33. **`-`** - Subtração.  
    - Exemplo: `int z = x - y;`
34. **`*`** - Multiplicação.  
    - Exemplo: `int z = x * y;`
35. **`/`** - Divisão.  
    - Exemplo: `int z = x / y;`
36. **`%`** - Módulo (resto).  
    - Exemplo: `int z = x % y;`
37. **`++`** - Incremento.  
    - Exemplo: `x++;`
38. **`--`** - Decremento.  
    - Exemplo: `x--;`
39. **`&&`** - Operador AND lógico.  
    - Exemplo: `if (x > 0 && y > 0) {}`
40. **`||`** - Operador OR lógico.  
    - Exemplo: `if (x > 0 || y > 0) {}`
41. **`!`** - Operador NOT lógico.  
    - Exemplo: `if (!flag) {}`

### Controle de Fluxo
42. **`if`** - Executa bloco se condição for verdadeira.  
    - Exemplo: `if (x > 5) { System.out.println("Maior"); }`
43. **`else`** - Executa bloco se condição for falsa.  
    - Exemplo: `else { System.out.println("Menor"); }`
44. **`else if`** - Testa nova condição.  
    - Exemplo: `else if (x == 5) { System.out.println("Igual"); }`
45. **`switch`** - Avalia expressão e executa casos.  
    - Exemplo: `switch (x) { case 1: System.out.println("Um"); break; }`
46. **`case`** - Define caso em switch.  
    - Exemplo: `case 1:`
47. **`default`** - Caso padrão em switch.  
    - Exemplo: `default: System.out.println("Outro");`
48. **`break`** - Interrompe loop ou switch.  
    - Exemplo: `break;`
49. **`continue`** - Pula para próxima iteração.  
    - Exemplo: `continue;`
50. **`return`** - Retorna valor de método.  
    - Exemplo: `return x * 2;`
51. **`for`** - Loop com contador.  
    - Exemplo: `for (int i = 0; i < 5; i++) { System.out.println(i); }`
52. **`while`** - Loop enquanto condição for verdadeira.  
    - Exemplo: `while (x > 0) { x--; }`
53. **`do`** - Loop que executa pelo menos uma vez.  
    - Exemplo: `do { x--; } while (x > 0);`

---

## 2. 🛠️ Comandos Intermediários

Comandos para manipulação de classes, objetos, coleções e tratamento de exceções.

### Classes e Objetos
54. **`constructor`** - Inicializa objeto.  
    - Exemplo: `public MyClass(int x) { this.x = x; }`
55. **`abstract`** - Define classe/método abstrato.  
    - Exemplo: `abstract class MyClass {}`
56. **`override`** - Sobrescreve método (usando @Override).  
    - Exemplo: `@Override public String toString() { return "MyClass"; }`
57. **`instanceof`** - Verifica tipo de objeto.  
    - Exemplo: `if (obj instanceof MyClass) {}`
58. **`toString()`** - Retorna representação em string.  
    - Exemplo: `public String toString() { return "x=" + x; }`
59. **`equals()`** - Compara objetos.  
    - Exemplo: `if (obj1.equals(obj2)) {}`
60. **`hashCode()`** - Gera código hash.  
    - Exemplo: `int hash = obj.hashCode();`
61. **`getClass()`** - Retorna classe do objeto.  
    - Exemplo: `Class<?> cls = obj.getClass();`
62. **`clone()`** - Cria cópia do objeto.  
    - Exemplo: `MyClass copy = (MyClass) obj.clone();`

### Exceções
63. **`try`** - Tenta executar código que pode lançar exceção.  
    - Exemplo: `try { int x = 1 / 0; }`
64. **`catch`** - Captura exceção.  
    - Exemplo: `catch (ArithmeticException e) { System.out.println(e); }`
65. **`finally`** - Executa após try/catch.  
    - Exemplo: `finally { System.out.println("Done"); }`
66. **`throw`** - Lança exceção.  
    - Exemplo: `throw new RuntimeException("Error");`
67. **`throws`** - Declara exceções lançadas por método.  
    - Exemplo: `void method() throws IOException {}`
68. **`Exception`** - Classe base para exceções.  
    - Exemplo: `catch (Exception e) {}`

### Coleções (java.util)
69. **`ArrayList`** - Lista dinâmica.  
    - Exemplo: `ArrayList<Integer> list = new ArrayList<>();`
70. **`add()`** - Adiciona elemento à lista.  
    - Exemplo: `list.add(10);`
71. **`remove()`** - Remove elemento da lista.  
    - Exemplo: `list.remove(0);`
72. **`get()`** - Obtém elemento por índice.  
    - Exemplo: `int x = list.get(0);`
73. **`set()`** - Substitui elemento por índice.  
    - Exemplo: `list.set(0, 20);`
74. **`size()`** - Retorna tamanho da lista.  
    - Exemplo: `int size = list.size();`
75. **`clear()`** - Remove todos os elementos.  
    - Exemplo: `list.clear();`
76. **`contains()`** - Verifica se elemento existe.  
    - Exemplo: `boolean has = list.contains(10);`
77. **`indexOf()`** - Retorna índice do elemento.  
    - Exemplo: `int index = list.indexOf(10);`
78. **`HashMap`** - Mapa chave-valor.  
    - Exemplo: `HashMap<String, Integer> map = new HashMap<>();`
79. **`put()`** - Adiciona par chave-valor.  
    - Exemplo: `map.put("key", 10);`
80. **`get()`** - Obtém valor por chave.  
    - Exemplo: `int value = map.get("key");`
81. **`remove()`** - Remove par por chave.  
    - Exemplo: `map.remove("key");`
82. **`containsKey()`** - Verifica se chave existe.  
    - Exemplo: `boolean hasKey = map.containsKey("key");`
83. **`keySet()`** - Retorna conjunto de chaves.  
    - Exemplo: `Set<String> keys = map.keySet();`
84. **`values()`** - Retorna coleção de valores.  
    - Exemplo: `Collection<Integer> values = map.values();`
85. **`HashSet`** - Conjunto de elementos únicos.  
    - Exemplo: `HashSet<Integer> set = new HashSet<>();`
86. **`add()`** - Adiciona elemento ao conjunto.  
    - Exemplo: `set.add(10);`
87. **`remove()`** - Remove elemento do conjunto.  
    - Exemplo: `set.remove(10);`
88. **`contains()`** - Verifica se elemento existe.  
    - Exemplo: `boolean has = set.contains(10);`

### Strings
89. **`length()`** - Retorna comprimento da string.  
    - Exemplo: `int len = "Hello".length();`
90. **`charAt()`** - Retorna caractere em índice.  
    - Exemplo: `char c = "Hello".charAt(0);`
91. **`substring()`** - Extrai parte da string.  
    - Exemplo: `String sub = "Hello".substring(1, 3);`
92. **`toUpperCase()`** - Converte para maiúsculas.  
    - Exemplo: `String upper = "hello".toUpperCase();`
93. **`toLowerCase()`** - Converte para minúsculas.  
    - Exemplo: `String lower = "HELLO".toLowerCase();`
94. **`trim()`** - Remove espaços em branco.  
    - Exemplo: `String clean = "  hello  ".trim();`
95. **`replace()`** - Substitui caracteres.  
    - Exemplo: `String newStr = "hello".replace("l", "p");`
96. **`split()`** - Divide string em array.  
    - Exemplo: `String[] arr = "a,b,c".split(",");`
97. **`contains()`** - Verifica se contém substring.  
    - Exemplo: `boolean has = "hello".contains("ell");`
98. **`startsWith()`** - Verifica se começa com substring.  
    - Exemplo: `boolean starts = "hello".startsWith("he");`
99. **`endsWith()`** - Verifica se termina com substring.  
    - Exemplo: `boolean ends = "hello".endsWith("lo");`

---

## 3. 🚀 Comandos Avançados

Comandos para funcionalidades modernas, concorrência, entrada/saída e expressões lambda.

### Generics
100. **`<T>`** - Define tipo genérico.  
     - Exemplo: `class MyClass<T> { T value; }`
101. **`?`** - Wildcard para tipos genéricos.  
     - Exemplo: `List<?> list;`
102. **`extends`** - Limita wildcard a superclasse.  
     - Exemplo: `List<? extends Number> list;`
103. **`super`** - Limita wildcard a subclasse.  
     - Exemplo: `List<? super Integer> list;`

### Streams (Java 8+)
104. **`stream()`** - Cria stream a partir de coleção.  
     - Exemplo: `list.stream().forEach(System.out::println);`
105. **`filter()`** - Filtra elementos por condição.  
     - Exemplo: `list.stream().filter(x -> x > 5).collect(Collectors.toList());`
106. **`map()`** - Transforma elementos.  
     - Exemplo: `list.stream().map(x -> x * 2).collect(Collectors.toList());`
107. **`sorted()`** - Ordena elementos.  
     - Exemplo: `list.stream().sorted().collect(Collectors.toList());`
108. **`collect()`** - Coleta resultados em coleção.  
     - Exemplo: `List<Integer> newList = list.stream().collect(Collectors.toList());`
109. **`forEach()`** - Executa ação para cada elemento.  
     - Exemplo: `list.stream().forEach(System.out::println);`
110. **`reduce()`** - Reduz stream a um valor.  
     - Exemplo: `int sum = list.stream().reduce(0, Integer::sum);`
111. **`count()`** - Conta elementos no stream.  
     - Exemplo: `long count = list.stream().count();`
112. **`anyMatch()`** - Verifica se algum elemento satisfaz condição.  
     - Exemplo: `boolean has = list.stream().anyMatch(x -> x > 5);`
113. **`allMatch()`** - Verifica se todos satisfazem condição.  
     - Exemplo: `boolean all = list.stream().allMatch(x -> x > 0);`
114. **`noneMatch()`** - Verifica se nenhum satisfaz condição.  
     - Exemplo: `boolean none = list.stream().noneMatch(x -> x < 0);`

### Lambda e Functional Interfaces
115. **`->`** - Sintaxe de expressão lambda.  
     - Exemplo: `x -> x * 2`
116. **`Function`** - Interface funcional para mapeamento.  
     - Exemplo: `Function<Integer, Integer> square = x -> x * x;`
117. **`Predicate`** - Interface para testes booleanos.  
     - Exemplo: `Predicate<Integer> isPositive = x -> x > 0;`
118. **`Consumer`** - Interface para ações sem retorno.  
     - Exemplo: `Consumer<Integer> print = x -> System.out.println(x);`
119. **`Supplier`** - Interface para fornecer valores.  
     - Exemplo: `Supplier<Integer> random = () -> 42;`

### Concorrência
120. **`Thread`** - Cria uma thread.  
     - Exemplo: `Thread t = new Thread(() -> System.out.println("Run"));`
121. **`start()`** - Inicia thread.  
     - Exemplo: `t.start();`
122. **`run()`** - Define tarefa da thread.  
     - Exemplo: `public void run() { System.out.println("Running"); }`
123. **`sleep()`** - Pausa thread.  
     - Exemplo: `Thread.sleep(1000);`
124. **`join()`** - Aguarda thread terminar.  
     - Exemplo: `t.join();`
125. **`synchronized`** - Sincroniza acesso a bloco/método.  
     - Exemplo: `synchronized (obj) { /* código */ }`
126��글: **`ExecutorService`** - Gerencia pool de threads.  
     - Exemplo: `ExecutorService es = Executors.newFixedThreadPool(2);`
127. **`submit()`** - Submete tarefa ao executor.  
     - Exemplo: `es.submit(() -> System.out.println("Task"));`
128. **`shutdown()`** - Encerra executor.  
     - Exemplo: `es.shutdown();`
129. **`Future`** - Representa resultado assíncrono.  
     - Exemplo: `Future<Integer> future = es.submit(() -> 42);`
130. **`Lock`** - Interface para controle de concorrência.  
     - Exemplo: `Lock lock = new ReentrantLock();`
131. **`lock()`** - Adquire trava.  
     - Exemplo: `lock.lock();`
132. **`unlock()`** - Libera trava.  
     - Exemplo: `lock.unlock();`

### Entrada/Saída (java.io, java.nio)
133. **`File`** - Representa arquivo/diretório.  
     - Exemplo: `File file = new File("example.txt");`
134. **`createNewFile()`** - Cria novo arquivo.  
     - Exemplo: `file.createNewFile();`
135. **`delete()`** - Deleta arquivo.  
     - Exemplo: `file.delete();`
136. **`exists()`** - Verifica se arquivo existe.  
     - Exemplo: `boolean exists = file.exists();`
137. **`FileReader`** - Lê caracteres de arquivo.  
     - Exemplo: `FileReader fr = new FileReader("example.txt");`
138. **`FileWriter`** - Escreve caracteres em arquivo.  
     - Exemplo: `FileWriter fw = new FileWriter("example.txt");`
139. **`BufferedReader`** - Lê texto com buffer.  
     - Exemplo: `BufferedReader br = new BufferedReader(new FileReader("example.txt"));`
140. **`BufferedWriter`** - Escreve texto com buffer.  
     - Exemplo: `BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));`
141. **`read()`** - Lê caractere/bytes.  
     - Exemplo: `int c = fr.read();`
142. **`write()`** - Escreve caractere/bytes.  
     - Exemplo: `fw.write("Hello");`
143. **`Files.readAllLines()`** - Lê todas as linhas de arquivo.  
     - Exemplo: `List<String> lines = Files.readAllLines(Paths.get("example.txt"));`
144. **`Files.write()`** - Escreve em arquivo.  
     - Exemplo: `Files.write(Paths.get("example.txt"), "Hello".getBytes());`

### Matemática (java.lang.Math)
145. **`Math.abs()`** - Retorna valor absoluto.  
     - Exemplo: `int abs = Math.abs(-5);`
146. **`Math.max()`** - Retorna maior valor.  
     - Exemplo: `int max = Math.max(10, 20);`
147. **`Math.min()`** - Retorna menor valor.  
     - Exemplo: `int min = Math.min(10, 20);`
148. **`Math.round()`** - Arredonda número.  
     - Exemplo: `long round = Math.round(3.7);`
149. **`Math.floor()`** - Arredonda para baixo.  
     - Exemplo: `double floor = Math.floor(3.7);`
150. **`Math.ceil()`** - Arredonda para cima.  
     - Exemplo: `double ceil = Math.ceil(3.2);`
151. **`Math.sqrt()`** - Calcula raiz quadrada.  
     - Exemplo: `double sqrt = Math.sqrt(16);`
152. **`Math.pow()`** - Calcula potência.  
     - Exemplo: `double pow = Math.pow(2, 3);`
153. **`Math.random()`** - Gera número aleatório.  
     - Exemplo: `double rand = Math.random();`

### Outros (java.lang)
154. **`System.out.println()`** - Imprime com nova linha.  
     - Exemplo: `System.out.println("Hello");`
155. **`System.out.print()`** - Imprime sem nova linha.  
     - Exemplo: `System.out.print("Hello");`
156. **`System.currentTimeMillis()`** - Retorna tempo em milissegundos.  
     - Exemplo: `long time = System.currentTimeMillis();`
157. **`System.exit()`** - Encerra JVM.  
     - Exemplo: `System.exit(0);`
158. **`Object.wait()`** - Pausa thread até notificação.  
     - Exemplo: `obj.wait();`
159. **`Object.notify()`** - Notifica thread em espera.  
     - Exemplo: `obj.notify();`
160. **`Object.notifyAll()`** - Notifica todas as threads.  
     - Exemplo: `obj.notifyAll();`

### Data e Hora (java.time)
161. **`LocalDate.now()`** - Obtém data atual.  
     - Exemplo: `LocalDate date = LocalDate.now();`
162. **`LocalTime.now()`** - Obtém hora atual.  
     - Exemplo: `LocalTime time = LocalTime.now();`
163. **`LocalDateTime.now()`** - Obtém data e hora atuais.  
     - Exemplo: `LocalDateTime dt = LocalDateTime.now();`
164. **`DateTimeFormatter`** - Formata data/hora.  
     - Exemplo: `DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");`
165. **`format()`** - Formata data/hora em string.  
     - Exemplo: `String formatted = dt.format(fmt);`

### Reflexão
166. **`Class.forName()`** - Carrega classe por nome.  
     - Exemplo: `Class<?> cls = Class.forName("MyClass");`
167. **`getDeclaredMethods()`** - Obtém métodos da classe.  
     - Exemplo: `Method[] methods = cls.getDeclaredMethods();`
168. **`getDeclaredFields()`** - Obtém campos da classe.  
     - Exemplo: `Field[] fields = cls.getDeclaredFields();`
169. **`invoke()`** - Invoca método via reflexão.  
     - Exemplo: `method.invoke(obj, args);`

### Anotações
170. **`@Override`** - Indica sobrescrita de método.  
     - Exemplo: `@Override public String toString() {}`
171. **`@Deprecated`** - Marca como obsoleto.  
     - Exemplo: `@Deprecated public void oldMethod() {}`
172. **`@SuppressWarnings`** - Suprime avisos do compilador.  
     - Exemplo: `@SuppressWarnings("unchecked") List list;`

### Outros Avançados
173. **`enum`** - Define tipo enumerado.  
     - Exemplo: `enum Color { RED, GREEN, BLUE }`
174. **`record`** - Define classe imutável (Java 14+).  
     - Exemplo: `record Point(int x, int y) {}`
175. **`sealed`** - Restringe herança (Java 17+).  
     - Exemplo: `sealed class Shape permits Circle, Square {}`
176. **`permits`** - Especifica subclasses permitidas.  
     - Exemplo: `permits Circle, Square`
177. **`instanceof` (padrão)** - Verifica tipo com correspondência (Java 14+).  
     - Exemplo: `if (obj instanceof String s) { System.out.println(s); }`
178. **`var`** - Inferência de tipo local (Java 10+).  
     - Exemplo: `var list = new ArrayList<String>();`
179. **`Optional`** - Contêiner para valores opcionais.  
     - Exemplo: `Optional<String> opt = Optional.of("Hello");`
180. **`orElse()`** - Retorna valor padrão se Optional vazio.  
     - Exemplo: `String value = opt.orElse("Default");`
181. **`isPresent()`** - Verifica se Optional tem valor.  
     - Exemplo: `boolean has = opt.isPresent();`
182. **`ifPresent()`** - Executa ação se Optional tem valor.  
     - Exemplo: `opt.ifPresent(System.out::println);`

### Rede (java.net)
183. **`URL`** - Representa endereço web.  
     - Exemplo: `URL url = new URL("https://example.com");`
184. **`HttpURLConnection`** - Conexão HTTP.  
     - Exemplo: `HttpURLConnection conn = (HttpURLConnection) url.openConnection();`
185. **`openConnection()`** - Abre conexão com URL.  
     - Exemplo: `URLConnection conn = url.openConnection();`

### JDBC
186. **`DriverManager.getConnection()`** - Conecta a banco de dados.  
     - Exemplo: `Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db", "user", "pass");`
187. **`PreparedStatement`** - Declaração SQL parametrizada.  
     - Exemplo: `PreparedStatement ps = conn.prepareStatement("SELECT * FROM table WHERE id = ?");`
188. **`executeQuery()`** - Executa consulta SQL.  
     - Exemplo: `ResultSet rs = ps.executeQuery();`
189. **`executeUpdate()`** - Executa atualização SQL.  
     - Exemplo: `int rows = ps.executeUpdate();`
190. **`close()`** - Fecha recurso (ex.: Connection, ResultSet).  
     - Exemplo: `conn.close();`

### Outros
191. **`Random`** - Gera números aleatórios.  
     - Exemplo: `Random rand = new Random();`
192. **`nextInt()`** - Gera inteiro aleatório.  
     - Exemplo: `int num = rand.nextInt(100);`
193. **`Scanner`** - Lê entrada do usuário.  
     - Exemplo: `Scanner scanner = new Scanner(System.in);`
194. **`nextLine()`** - Lê linha de entrada.  
     - Exemplo: `String line = scanner.nextLine();`
195. **`nextInt()`** - Lê inteiro de entrada.  
     - Exemplo: `int num = scanner.nextInt();`
196. **`assert`** - Verifica asserção.  
     - Exemplo: `assert x > 0 : "x must be positive";`
197. **`strictfp`** - Garante precisão em cálculos de ponto flutuante.  
     - Exemplo: `strictfp class MyClass {}`
198. **`transient`** - Exclui campo da serialização.  
     - Exemplo: `transient int temp;`
199. **`volatile`** - Garante visibilidade de variável em threads.  
     - Exemplo: `volatile boolean running;`
200. **`System.gc()`** - Sugere coleta de lixo.  
     - Exemplo: `System.gc();`

---

## 📝 Notas Finais
- **Compatibilidade**: Alguns recursos (ex.: `record`, `sealed`) requerem Java 14+. Verifique a versão usada.
- **Boas Práticas**: Use `try-with-resources` para gerenciar recursos, prefira `Optional` para valores nulos, e evite `System.gc()`.
- **Exploração**: Consulte a documentação oficial da Oracle para detalhes.