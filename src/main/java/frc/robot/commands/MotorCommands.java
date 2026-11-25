package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.MotorSubsystem;

public class MotorCommands extends Command {

  public static Command spin(MotorSubsystem motor, double speed) {
    return Commands.run(
      () -> {
        motor.spinMotor(speed);
            
        },
        motor);
  }
}