(ns com.yetanalytics.dave.func.util-test
  (:require
   [clojure.test #?(:cljs :refer-macros
                    :clj :refer) [deftest is testing]]
   [clojure.spec.alpha :as s]
   [clojure.spec.test.alpha :as stest]
   clojure.test.check.generators
   [com.yetanalytics.dave.func.util :as util]
   [com.yetanalytics.dave.test-support :refer [failures stc-opts]]))

(deftest timestamp->inst-test
  (is (empty?
       (failures
        (stest/check
         `util/timestamp->inst)))))

(deftest inst->timestamp-test
  (is (empty?
       (failures
        (stest/check
         `util/inst->timestamp)))))

(deftest time-bucket-statements-test
  (is (empty?
       (failures
        (stest/check
         `util/time-bucket-statements
         {stc-opts
          {:num-tests 10 :max-size 3}})))))

(deftest min-inst-test
  (is (empty?
       (failures
        (stest/check
         `util/min-inst
         {stc-opts
          {:num-tests 10 :max-size 10}})))))

(deftest max-inst-test
  (is (empty?
       (failures
        (stest/check
         `util/max-inst
         {stc-opts
          {:num-tests 10 :max-size 10}})))))

(deftest nested-group-by+test
  (is (empty?
       (failures
        (stest/check
         `util/nested-group-by+
         {stc-opts
          {:num-tests 10 :max-size 10}})))))

(deftest update-domain-test
  (is (empty?
       (failures
        (stest/check
         `util/update-domain
         {stc-opts
          {:num-tests 10 :max-size 3}})))))
