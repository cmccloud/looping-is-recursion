(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc n]
                 (if (>= n exp) acc
                   (recur (* base acc) (inc n))))]
    (cond (= base 0) 0
          (<= exp 0) 1
          :else (helper 1 0))))

(defn last-element [a-seq]
  (cond (empty? a-seq) nil
        (empty? (rest a-seq)) (first a-seq)
        :else (recur (rest a-seq))))

(defn seq= [seq1 seq2]
  (let [x (first seq1)
        y (first seq2)]
    (cond (empty? seq1) (empty? seq2)
          (empty? seq2) (empty? seq1)
          (= x y) (recur (rest seq1) (rest seq2))
          :else false)))

(defn find-first-index [pred a-seq]
  (loop [n 0 value a-seq]
    (cond (empty? value) nil
          (pred (first value)) n
          :else (recur (inc n) (rest value)))))

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

