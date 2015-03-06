(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc n]
                 (if (>= n exp) acc
                   (recur (* base acc) (inc n))))]
    (cond (= base 0) 0
          (<= exp 0) 1
          :else (helper 1 0))))

(defn last-element [a-seq]
  ":(")

(defn seq= [seq1 seq2]
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

