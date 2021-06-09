Main.class:
	javac -Xlint  *.java
run:
	java -Xmx64m Main
clean:
	rm -f *.class
tar:
	tar -cvz makefile *.java -f LinkedList.tar.gz