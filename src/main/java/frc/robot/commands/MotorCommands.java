package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants;
import frc.robot.subsystems.MotorSubsystem;

public class MotorCommands {

    public static Command spin(MotorSubsystem speed){

            return Commands.run(() -> {

                speed.go(Constants.motorPercentPower);
                
            }, speed);
        }
    public static Command brake(MotorSubsystem motorSubsystem){
        
            return Commands.run(() -> {

                motorSubsystem.brake();
            }, motorSubsystem);
    }
}