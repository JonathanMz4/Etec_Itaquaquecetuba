import { ApiProperty } from '@nestjs/swagger';
import { IsString, IsUrl } from 'class-validator';

export class CreateDogsDto {
    @ApiProperty()
    @IsString()
    name: string;

    @ApiProperty()
    @IsUrl()
    image: string;
}

// NestJS Swagger
// NestJS Validation
// NetsJs DTO (Data Transfomrer)
