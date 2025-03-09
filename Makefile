

LAB_SOURCES = $(shell find lab -name '*.java')
LAB_CLASSES = $(LAB_SOURCES:.java=.class)

REGULAR_SOURCES = $(shell find regular -name '*.java')
REGULAR_CLASSES = $(REGULAR_SOURCES:.java=.class)

PROG_SOURCES = $(shell find programs -name '*.java')
PROG_CLASSES = $(PROG_SOURCES:.java=.class)

exec_stubs = $(shell find . -name '*.java' | xargs grep -l 'public static void main')
exec_classes = $(exec_stubs:.java=.class)

.PHONY: all lab regular clean

all: lab regular programs


lab: $(LAB_CLASSES)

regular: $(REGULAR_CLASSES)

programs: $(PROG_CLASSES)

%.class: %.java
	javac $<


clean:
	rm -rf $(shell find . -name '*.class')
