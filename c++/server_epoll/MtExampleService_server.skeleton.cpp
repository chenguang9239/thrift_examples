// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.
#include <stdint.h>
#include "MtExampleService.h"
#include <protocol/TBinaryProtocol.h>
#include <server/TEpollServer.h>
#include <transport/TServerEpollSocket.h>
#include <transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using boost::shared_ptr;


class MtExampleServiceHandler : virtual public MtExampleServiceIf {
 public:
  MtExampleServiceHandler() {
    // Your initialization goes here
  }

  int32_t SetUserProfile(const UserProfile& oProfile) {
    // Your implementation goes here
    printf("SetUserProfile\n");
  }

  void GetUserProfile(UserProfile& _return, const int32_t userId) {
    // Your implementation goes here
    printf("GetUserProfile\n");
  }

};

int main(int argc, char **argv) {
	int port = 9090;
	shared_ptr<MtExampleServiceHandler> handler(new MtExampleServiceHandler());
	shared_ptr<TProcessor> processor(new MtExampleServiceProcessor(handler));

	shared_ptr<TServerTransport> serverTransport(new TServerEpollSocket(port, 1000, 1000));
	shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
	shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

	TEpollServer server(processor, serverTransport, transportFactory, protocolFactory);

	server.listen();
	int processnum = 10;
	for(int i = 1; i <= processnum; ++i){
	if(fork() == 0){

	    fprintf(stderr, "Process %d start serve()\n", getpid());
	    server.epoll();

	    server.serve();
	    break;
	}
	}

	exit(0);
	return 0;
}

