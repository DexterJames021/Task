| Interface           | Method Signature  | Use Case                  |
| ------------------- | ----------------- | ------------------------- |
| `Predicate<T>`      | `boolean test(T)` | Testing a condition       |
| `Function<T, R>`    | `R apply(T)`      | Mapping input to output   |
| `Consumer<T>`       | `void accept(T)`  | Consumes input, no return |
| `Supplier<T>`       | `T get()`         | Provides a value          |
| `BiFunction<T,U,R>` | `R apply(T, U)`   | Two inputs, one output    |


