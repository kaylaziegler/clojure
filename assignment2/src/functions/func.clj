(ns functions.func
  (:gen-class))


;implementation that I thought would work but doesn't
; and didn't feel like removing it
;dotimes might be deprecated
; (defn factorial [maxnum]
 	;repeat a*a+1 up to maxnum
; 	(dotimes [a maxnum] (def a (* a 1))))



;takes parameter x
;if a is less than 2, returns 1
;else does recursive call, multiply a by a-1
(defn factorial [a]
  (if (< a 2) 1
    (* a (factorial (- a 1)))))


;takes two parameters a b
;recur= loop/tail recursion, evaluated last
;zero?= test for whether b is 0, returns T if zero
;if zero? b= true then returns a
(defn gcd [a b]
  (if (zero? b) 
  	a
  	(recur b (mod a b))))



(defn area [x]
	;read dimensions from user input, evaluate within case
	(case x
		"rectangle" (* (read-string (read-line)) (read-string (read-line)))
		"circle" (* Math/PI (read-string (read-line)))
		"triangle" (* 0.5 (* (read-string (read-line)) (read-string (read-line))))
		"some other area")
	)





(defn -main
  [& args]
  ;read-line is user input in command line
  ;read-string converts user input to integer
  (println "Factorial: " (factorial (read-string (read-line))))
  (println "GCD: " (gcd (read-string (read-line)) (read-string (read-line))))
  (println "Area: " (area (read-line)))
  )




