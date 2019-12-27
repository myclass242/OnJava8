package com.zy.inner;

public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;
                TrackingSlip(String id) {
                    this.id = id;
                }
                String getId() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slib");
            System.out.println(ts.getId());
        } else {
//            TrackingSlip ts = new TrackingSlip("slib");
            System.out.println("NO TrackingSlip");
        }
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.internalTracking(true);
        p.internalTracking(false);
    }
}
