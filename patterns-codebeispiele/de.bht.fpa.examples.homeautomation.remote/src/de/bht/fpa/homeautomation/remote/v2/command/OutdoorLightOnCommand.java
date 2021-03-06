package de.bht.fpa.homeautomation.remote.v2.command;

import de.bht.fpa.homeautomation.vendors.OutdoorLight;

public class OutdoorLightOnCommand implements ICommand {
  private final OutdoorLight outdoorLight;

  public OutdoorLightOnCommand(OutdoorLight outdoorLight) {
    this.outdoorLight = outdoorLight;
  }

  @Override
  public void execute() {
    System.out.println(this.getClass().getSimpleName() + ".execute()");
    outdoorLight.on();
  }
}
