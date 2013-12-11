(defproject cassandra-hadoop "0.1.5"
  :min-lein-version "2.0.0"
  :description "A Clojure client for Apache Cassandra"
  :url "http://clojurecassandra.info"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :dependencies [[org.apache.cassandra/cassandra-all "1.2.11"]
                 [org.apache.cassandra/cassandra-thrift "1.2.11"]
                 [org.apache.hadoop/hadoop-common "2.0.0-cdh4.2.0"]
                 [org.apache.hadoop/hadoop-core "2.0.0-mr1-cdh4.2.0"]
                 [org.apache.hadoop/hadoop-minicluster "2.0.0-mr1-cdh4.2.0"]
                 ;; [org.apache.hadoop/hadoop-mapreduce-client-core "2.2.0"]
                 ;; [org.apache.pig/pig "0.8.0"]
                 ]
  :java-source-paths ["src/main/java"]
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail :update :always}}
                 "cloudera" {:url "https://repository.cloudera.com/artifactory/cloudera-repos/" }
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}})
