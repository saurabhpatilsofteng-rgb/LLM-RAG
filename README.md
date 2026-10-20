# LLM-RAG

Ollama	Runs or open ai  an AI model locally on your computer.
2	LLM (Large Language Model)	Generates answers from text prompts.
3	Spring AI	Connects your Java application to the AI model.
4	OllamaChatModel	Sends a prompt to Ollama and returns the response.
5	Spring Boot	Builds and runs the backend application.
6	REST API	Allows a browser or frontend to communicate with the backend.
7	@RestController	Defines a controller that returns HTTP responses.
8	@RequestMapping	Defines the base URL for the controller.
9	@GetMapping	Maps HTTP GET requests to a Java method.
10	@RequestParam	Reads the message parameter from the URL.
11	Constructor injection	Injects OllamaChatModel into the controller.
12	application.properties	Configures the server port, Ollama URL, and model.
13	Maven dependencies	Adds Spring Web and Spring AI libraries to the project.
14	HTTP request/response	Sends the question to Java and returns the AI-generated answer.


ChatClient	Fluent API for communicating with an LLM
system()	Defines the AI's behavior and role
user()	Provides the user's question
call()	Executes the model request
content()	Extracts the generated text
Dependency injection	Injects ChatClient into your service
Service layer	Separates AI logic from the controller


@Configuration tells Spring that this class defines application configuration.
@Bean registers a ChatClient object in the Spring container.
ChatClient.Builder is auto-configured by Spring AI.
build() creates the client used to send prompts to Ollama.


ChatClient	A fluent API for interacting with an AI model.
@Configuration	Defines Spring application configuration.
@Bean	Registers an object in the Spring container.
ChatClient.Builder	Creates a configured ChatClient.
@Service	Marks a class that contains application logic.
Constructor injection	Injects ChatClient into your service.
.prompt()	Starts building an AI request.
.system()	Defines the AI's role and behavior.
.user()	Supplies the user's question.
.call()	Executes the AI request synchronously.
.content()	Extracts the generated response text.
Layered architecture	Separates controller and service responsibilities.


Low temperature — 0.0 to 0.3

Usually more predictable responses. Useful for factual answers, structured output, and consistent explanations.

Medium temperature — around 0.5

A practical starting point for general-purpose chat.

Higher temperature — around 0.8 to 1.0

Can produce more varied responses. It does not guarantee better creativity or correctness.

Streaming	Sends output progressively
Flux<T>	Reactive stream of zero or more values
SSE	HTTP mechanism for streaming server-to-client events
ChatClient	Spring AI API for interacting with chat models
call() vs stream()	Complete response vs progressive response




