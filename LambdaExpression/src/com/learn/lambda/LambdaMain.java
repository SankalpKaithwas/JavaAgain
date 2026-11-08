package com.learn.lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaMain {

		public static void main(String[] args) {
			
			 simpleLambda("Test", "Beat");

			zeroParameter();

			streamAPIProcessing();

			collectionUtiltyMethods();

			customFunctionalInterfaces();

			complexSortingAndCustomComparators();

			mapOperations();

			javaOptionalPipelines();

			advancedStreamReductionsAndGrouping();

			higherOrderFunctions();

//		// Thread / Runnable
//		new Thread(() -> System.out.println("Background thread")).start();
//
//		// CompletableFuture
//		CompletableFuture.supplyAsync(() -> fetchRemoteData())
//		    .thenApply(data -> parseJson(data))
//		    .thenAccept(record -> saveToDatabase(record));
		}

		private static void simpleLambda(String string, String string2) {
			var planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
					"Neptune" };

			// 1.
			Arrays.sort(planets, (first, second) -> first.length() - second.length());
			System.out.println(Arrays.toString(planets));

			// 2. SAME AS 1.
//			Comparator<String> comp = (String first, String second) -> first.length() - second.length();
//			Arrays.sort(planets, comp);
//			System.out.println(Arrays.toString(planets));

		}

		private static void higherOrderFunctions() {
			Function<String, String> trim = String::trim;
			Function<String, String> lower = String::toLowerCase;
			Function<String, String> sanitize = trim.andThen(lower);

			System.out.println(sanitize.apply("   ADMIN@DOMAIN.COM  "));
			// Output: "admin@domain.com"

			Predicate<Integer> isPositive = n -> n > 0;
			Predicate<Integer> isEven = n -> n % 2 == 0;
			Predicate<Integer> isPositiveOdd = isPositive.and(isEven.negate());

			System.out.println(isPositiveOdd.test(7)); // true
			System.out.println(isEven.test(7)); // false
			System.out.println(isPositiveOdd.test(8)); // false

		}

		private static void advancedStreamReductionsAndGrouping() {
			List<Employee> team = List.of(new Employee("Alice", "Engineering", 120000),
					new Employee("Bob", "Engineering", 95000), new Employee("Charlie", "Sales", 85000),
					new Employee("David", "Sales", 90000));

			// Grouping by department and computing average salary
			Map<String, Double> avgSalaryByDept = team.stream()
					.collect(Collectors.groupingBy(Employee::department, 
							Collectors.averagingDouble(Employee::salary)));
			System.out.println("avgSalaryByDept - " + avgSalaryByDept);

			// Partitioning into two groups: High earners (>= 100k) vs regular
			Map<Boolean, List<String>> partitioned = team.stream().collect(Collectors.partitioningBy(
					e -> e.salary() >= 100000, Collectors.mapping(Employee::name, Collectors.toList())));
			// Result: {false=[Bob, Charlie, David], true=[Alice]}
			System.out.println("partitioned - " + partitioned);

		}

		private static void javaOptionalPipelines() {

			Optional<Order> orderOpt = findOrderById("ORD-101");

			// 1. map (Function): Transform value inside optional
			Optional<String> customerEmail = orderOpt.map(Order::customer).map(Customer::email);
			System.out.println("customerEmail - " + customerEmail);

			// 2. filter (Predicate): Discard if condition fails
			Optional<Order> highValueOrder = orderOpt.filter(order -> order.total() > 500.0);
			System.out.println("highValueOrder - " + highValueOrder);
			// 3. ifPresent (Consumer): Run action if value exists
			highValueOrder.ifPresent(order -> sendVipNotification(order.customer()));

			orderOpt = findOrderById("");
			// 4. orElseGet (Supplier): Lazy fallback execution (evaluated ONLY if empty)
			Order fallback = orderOpt.orElseGet(() -> createDefaultGuestOrder());
			System.out.println("fallback - " + fallback);

			// 5. orElseThrow: Throw dynamic exceptions lazily
//		Order required = orderOpt.orElseThrow(() -> new NoSuchElementException("Order not found"));

		}

		private static Order createDefaultGuestOrder() {
			Customer customer = new Customer("Jess", "Jess@mail.com");
			return new Order("ORD-103", 1125.00, customer);
		}

		private static Object sendVipNotification(Customer customer) {
			System.out.println("Email sent");
			return new Customer("New", "new");
		}

		private static Optional<Order> findOrderById(String string) {
			if (!(string.isBlank() && string.isEmpty())) {
				Customer customer = new Customer("Emma", "Emmy@mail.com");
				return Optional.ofNullable(new Order("ORD-101", 1951.00, customer));
			} else
				return Optional.empty();
		}

		private static void mapOperations() {
			Map<String, List<String>> userRoles = new HashMap<>();

			// computeIfAbsent: initializes the list only if key is missing
			userRoles.computeIfAbsent("admin", k -> new ArrayList<>())
			.addAll(List.of("READ_WRITE", "Refactor"));
			userRoles.computeIfAbsent("guest", k -> new ArrayList<>()).add("READ_ONLY");
			System.out.println(userRoles);

			// merge: frequency counter pattern (BiFunction)
			Map<String, Integer> wordCounts = new HashMap<>();
			List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");

			words.forEach(w -> wordCounts.merge(w, 1, (oldVal, newVal) -> oldVal + newVal));
			System.out.println(wordCounts);
			// wordCounts -> {apple=3, banana=2, orange=1}

			// replaceAll: bulk update values using a BiFunction
			Map<String, Double> prices = new HashMap<>(Map.of("itemA", 100.0, "itemB", 50.0));
			prices.replaceAll((item, price) -> price * 1.10); // Apply 10% tax to all
			System.out.println(prices);

		}

		public static void complexSortingAndCustomComparators() {
			List<Employee> employees = Arrays.asList(new Employee("Sara", "IT", 95000),
					new Employee("John", "Finance", 80000), new Employee("Alex", "IT", 110000),
					new Employee("Maya", "Finance", 80000), new Employee("Maya", "Accounts", 80000));

			employees.sort((e1, e2) -> Double.compare(e2.salary(), e1.salary()));
			System.out.println(employees);

			// Multi-level sorting: department ascending, then salary descending, then name
			employees.sort(Comparator.comparing(Employee::department)
					.thenComparing(Employee::salary, Comparator.reverseOrder()).thenComparing(Employee::name));

			System.out.println(employees);
		}

		public static void customFunctionalInterfaces() {
			Validator<String> emailValidator = email -> email != null && email.contains("@");
			System.out.println(emailValidator.validate("Email@gmail.com"));
			System.out.println(emailValidator.validate(" "));
			System.out.println(emailValidator.validate("Email.com"));
		}

		private static void collectionUtiltyMethods() {
			Map<Integer, String> users = new HashMap<>();
			users.put(101, "Brad");
			users.put(102, "Zayn");
			users.put(103, "Max");
			// forEach (BiConsumer)
			users.forEach((id, name) -> System.out.println(id + ": " + name));

			// computeIfAbsent (Function)
			users.computeIfAbsent(3, id -> "User_" + id);

			// removeIf (Predicate)
			List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
			numbers.removeIf(n -> n % 2 != 0);
			System.out.println(numbers);

		}

		public static void streamAPIProcessing() {
//		Lambdas provide pipelines with declarative data processing:
			List<String> names = List.of("Alice", "Bob", "Charlie", "Adam");

			List<String> result = names.stream().filter(name -> name.startsWith("A")) // Predicate
					.map(name -> name.toUpperCase()) // Function
					.collect(Collectors.toList());
			System.out.println(result);
		}

		public static void zeroParameter() {
			Runnable runner = () -> System.out.println("This is Runnable, Running a task");
			runner.run();
			/** Parentheses () are strictly required. */
		}

	
}
