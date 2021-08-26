package pl.sda.zadanie2;

public enum PackageSize {
    SMALL(1, 10), MEDIUM(11, 20), LARGE(21, 30);
    private int minSize;
    private int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int size){
        for (PackageSize packageSize:PackageSize.values()){
            if (size >= packageSize.minSize && size <= packageSize.maxSize){
             return packageSize;
            }
        }throw new PackageSizeNotFoundExpection();
    }


}
