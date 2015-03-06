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
  (if (empty? a-seq) nil
      (loop [total 0 count 0 values a-seq]
        (if (empty? values)
          (/ total count)
          (recur (+ total (first values))
                 (inc count)
                 (rest values))))))

(defn toggle [a-set elem]
  (if (contains? a-set elem)
    (disj a-set elem)
    (conj a-set elem)))

(defn parity [a-seq]
  (loop [s #{} values a-seq]
    (if (empty? values) s
      (recur (toggle s (first values))
             (rest values)))))

(defn fast-fibo [n]
  (loop [total 1 last 0 count 0]
    (if (<= n count) last
        (recur (+ total last)
               total
               (inc count)))))

(defn cut-at-repetition [a-seq]
  [":("])

