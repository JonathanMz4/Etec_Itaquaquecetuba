import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { GaleriaController } from './galeria/galeria.controller';
import { ContatoController } from './contato/contato.controller';
import { DogsController } from './dogs/dogs.controller';
import { DogsService } from './dogs/dogs.service';

@Module({
  imports: [],
  controllers: [AppController, GaleriaController, ContatoController, DogsController],
  providers: [AppService, DogsService],
})
export class AppModule {}
