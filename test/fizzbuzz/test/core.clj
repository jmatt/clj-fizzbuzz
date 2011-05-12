(ns fizzbuzz.test.core
  (:use [fizzbuzz.core])
  (:use [clojure.test]))

(deftest fizzbuzz.core ;; Test mod 3, mod 5, mod 15, number.
  (is true (= (fizzbuzz.core/fizzbuzz 1) 1))
  (is true (= (fizzbuzz.core/fizzbuzz 98) 98))
  (is true (= (fizzbuzz.core/fizzbuzz 3) "Fizz"))
  (is true (= (fizzbuzz.core/fizzbuzz 5) "Buzz"))
  (is true (= (fizzbuzz.core/fizzbuzz 15) "FizzBuzz"))
  (is true (= (fizzbuzz.core/fizzbuzz 100) "FizzBuzz")))
