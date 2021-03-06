package net.woggioni.jpms.loader.example.bundle;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import net.woggioni.jpms.loader.a.A;
import net.woggioni.jpms.loader.a.ClassLoadingUtils;
import net.woggioni.jpms.loader.a.P2d;
import net.woggioni.jpms.loader.example.bundle.impl.BundleImpl;

public class Bundle implements Runnable {

    @Override
    @SneakyThrows
    public void run() {
        ClassLoadingUtils.debugClass(P2d.class.getName(), getClass());
        ClassLoadingUtils.debugClass(ObjectMapper.class.getName(), getClass());
        BundleImpl.run();
        P2d p1 = new P2d(1,2);
        P2d p2 = new P2d(3,4);
        System.out.printf("Distance from %s to %s is %d\n", p1.toString(), p2.toString(), A.distance(p1, p2));
    }
}
