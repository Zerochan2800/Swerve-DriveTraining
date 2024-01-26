package frc.robot.subsystems;
import com.ctre.phoenix.sensors.WPI_CANCoder;
import com.revrobotics.CANSparkMax;


public class SwerveModule {
    CANSparkMax angleMotor;
    CANSparkMax driveMotor;
    WPI_CANCoder encoder;
    double oldDeltaAngle = 0;
    double currentAngle;
    double currentAngleSpeed;
    boolean invertAngleMotor;
    boolean invertDriveMotor;
    boolean isBackwards = false;
    SwerveModule(CANSparkMax inputAngleMotor, Boolean InvertAngleMotor, WPI_CANCoder inputEncoder, CANSparkMax inputthrottleMotor, Boolean invertthrottleMotor)
    {
    angleMotor = inputAngleMotor;
    invertAngleMotor = InvertAngleMotor;
    invertDriveMotor = InvertAngleMotor;
    driveMotor = inputthrottleMotor;
    encoder = inputEncoder;
    }
}

