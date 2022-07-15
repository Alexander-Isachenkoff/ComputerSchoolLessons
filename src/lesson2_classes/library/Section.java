package lesson2_classes.library;

enum Section {
    SCIENCE("Наука"), FANTASTIC("Фантастика"), BIOGRAPHY("Биография");
    String sectionName;

    Section(String section) {
        this.sectionName = section;
    }
}
