# To Reproduce

Run `clojure -A:dev`, then at the repl `(refresh)`. On Open JDK 8 you will see that it refreshed namespaces. On Open JDK 11, you will see an empty list.
