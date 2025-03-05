

LAB_SOURCES = $(shell find lab -name '*.java')
LAB_CLASSES = $(LAB_SOURCES:.java=.class)

REGULAR_SOURCES = $(shell find regular -name '*.java')
REGULAR_CLASSES = $(REGULAR_SOURCES:.java=.class)

exec_stubs = $(shell find . -name '*.java' | xargs grep -l 'public static void main')
exec_classes = $(exec_stubs:.java=.class)

.PHONY: all lab regular clean

all: lab regular


lab: $(LAB_CLASSES)

regular: $(REGULAR_CLASSES)


%.class: %.java
	javac $<


clean:
	rm -rf $(shell find . -name '*.class')
