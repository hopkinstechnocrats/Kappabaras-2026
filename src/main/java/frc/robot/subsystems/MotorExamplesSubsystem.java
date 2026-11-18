package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorExamplesSubsystem extends SubsystemBase {

     TalonFX krakenExampleMotor;
     TalonFX krakenExampleFollower;

    public MotorExamplesSubsystem() {

        krakenExampleMotor = new TalonFX(Constants.SubsystemConstants.kKrakenExampleCANID);
        krakenExampleFollower = new TalonFX(Constants.SubsystemConstants.kKrakenFollowerExampleCANID);

    }

     public void SpinMotorPercentSpeed (double speed){
        krakenExampleMotor.set(speed);
    }


        
}
}