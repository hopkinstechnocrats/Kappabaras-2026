package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase{
    
    WPI_TalonSRX motorExample;

    public MotorSubsystem(){
        motorExample = new WPI_TalonSRX(Constants.testMotorCANID);
    }

    public void go(double power){
        motorExample.set(power);
    }

    public void brake(){
        motorExample.set(Constants.testMotorBrakeSpeed);
    }
}