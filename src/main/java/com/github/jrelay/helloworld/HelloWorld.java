package com.github.jrelay.helloworld;

import com.github.jrelay.Relay;
import com.github.jrelay.jssc.JsscRelayDriver;
import com.github.jrelay.usbhid.UsbHidRelayDriver;

/**
 * Created by nightingale on 08.05.16.
 */
public class HelloWorld {

    static {
        // set all available drivers
        Relay.setDrivers(UsbHidRelayDriver.class, JsscRelayDriver.class);
    }

    public static void main(String[] args) throws Exception{
        //get all available relays
        Relay relay = Relay.getDefault();
        //open relay
        relay.open();
        //wait 1 second
        Thread.sleep(1000l);
        //relay close
        relay.close();
    }
}
