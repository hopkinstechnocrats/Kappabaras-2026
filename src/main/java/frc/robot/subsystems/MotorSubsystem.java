package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {

    WPI_TalonSRX exampleMotor;

    public MotorSubsystem() {
        exampleMotor = new WPI_TalonSRX(Constants.exampleMotorCANID);

        exampleMotor.configFactoryDefault();
        exampleMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void spinMotor(double speed){
        exampleMotor.set(speed);
    }

    public void brake(){
        exampleMotor.set(0);
    }

}