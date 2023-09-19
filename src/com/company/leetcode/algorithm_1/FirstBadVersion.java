package com.company.leetcode.algorithm_1;



public class FirstBadVersion {
    private final static int n1 = 5;
    private final static int bad1 = 4;
    private final static VersionCheck ver1 = new VersionCheck(bad1);

    private final static int n2 = 1;
    private final static int bad2 = 1;
    private final static VersionCheck ver2 = new VersionCheck(bad2);


    public static void runExamples() {
        System.out.println("Example1: " + (firstBadVersion(n1, ver1) == bad1) + " c:" + ver1.getCounter());
        System.out.println("Example2: " + (firstBadVersion(n2, ver2) == bad2) + " c:" + ver2.getCounter());
    }

    private static int firstBadVersion(int n, VersionCheck v) {
        int l = 1;
        int r = n;
        int p = l + ((r - l) / 2);
        int hb = -1;
        int hg = 0;
        while(true) {
            if(v.isBadVersion(p)) {
                hb = p;
                if(hb == 1) {
                    return 1;
                }
            } else {
                hg = p;
            }
            if(hg + 1 == hb) {
                return hb;
            }
            p = l + ((r - l) / 2);
        }
    }
}
class VersionCheck {
    private final int bad;
    private int c = 0;

    public VersionCheck(int bad) {
        this.bad = bad;
    }

    public boolean isBadVersion(int version) {
        c += 1;
        return version >= bad;
    }

    public int getCounter() {
        return c;
    }
}
