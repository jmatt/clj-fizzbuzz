;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; http://www.codinghorror.com/blog/2007/02/why-cant-programmers-program.html
;;
;; Write a program that prints the numbers from 1 to 100. But for
;; multiples of three print "Fizz" instead of the number and for the
;; multiples five print "Buzz". For numbers which are multiples of
;; both three and five print "FizzBuzz".
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns fizzbuzz.core)

(defn fizzbuzz [i]
  (if (= (mod i 15) 0)
    "FizzBuzz"
    (if (= (mod i 3) 0)
      "Fizz"
      (if (= (mod i 5) 0)
        "Buzz"
        i))))

(apply println (interpose "\n" (map fizzbuzz (range 1 101)))) ;; 1->101 inclusive...
