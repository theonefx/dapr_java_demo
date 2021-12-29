clean:
	mvn clean

mvn: clean
	mvn package -Dmaven.test.skip

build: mvn
	docker buildx build \
		--platform linux/arm64,linux/amd64 \
		-t edge-test-registry.cn-hangzhou.cr.aliyuncs.com/dapr/provider:latest \
		. --push