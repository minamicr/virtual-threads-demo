# Threads em Java (java.lang.thread)
## Thread de plataforma
- S.O.(sistema operacional) gerencia todas threads
   - thread1
   - thread2
   - thread3
 - para cada thread são alocados recursos da máquina: CPU, memória, disco
 - a quantidade de threads está limitada aos recursos da máquina
 - exemplo:
     - 1 request = 3 segundos
     - 1 máquina com 8 threads
     - para realizar 32 requisições
       - 32 / 8 = 4 ciclos * 3 seg = 12 seg para executar 32 requisições
     - throughput (vazão) do processo é considerado como 8 threads
     - para ter mais threads é necessário upgrade na máquina
## Threads Virtuais
- JVM utiliza uma thread do S.O. (sistema operacional) e gerencia todas as virtual threads
  - virtual thread 1
  - virtual thread 2
  - virtual thread 3
  - não há limite
- JVM otimiza os recursos para java e gerenciamento das threads
- exemplo:
  - 1 request = 3 segundos
  - 32 requests podem ser feitas por 32 virtual threads, com uso mais eficiente de CPU, RAM, disco
  - portanto a execução toda é feita em 3 segundos

## Recomendações (documentação Oracle)
Virtual threads are suitable for running tasks that spend most of the time blocked, often waiting for I/O operations to complete. However, they aren't intended for long-running CPU-intensive operations.

Use virtual threads in high-throughput concurrent applications, especially those that consist of a great number of concurrent tasks that spend much of their time waiting. Server applications are examples of high-throughput applications because they typically handle many client requests that perform blocking I/O operations such as fetching resources.

Virtual threads are not faster threads; they do not run code any faster than platform threads. They exist to provide scale (higher throughput), not speed (lower latency).

## Case Netflix
Experimentação com virtual threads ....

**Fontes:**
- Conheça o poder das Virtual Threads com Java e Spring Boot - Giuliana Bezerra (https://www.youtube.com/watch?v=a8gMokxIt4Q&t=741s)
- Documentação Oracle: https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html#GUID-2BCFC2DD-7D84-4B0C-9222-97F9C7C6C521
- Case Netflix detalhado: https://netflixtechblog.com/java-21-virtual-threads-dude-wheres-my-lock-3052540e231d
- Case Netflix: https://www.infoq.com/news/2024/08/netflix-performance-case-study/